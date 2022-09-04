package com.example.lesson4_month3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SecondFragment extends Fragment implements OnItemClickListener{
    private RecyclerView recyclerView;
    private ArrayList<Country> countries;
//    private ArrayList<Continent> continents;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerView_country);
//        ContinentAdapter continentAdapter = new ContinentAdapter(continents);
        onItemClick(getArguments().getInt("pos"));
        CountryAdapter adapter = new CountryAdapter(countries);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        countries = new ArrayList<>();
        countries.add(new Country("Китай", "Пекин",
                "https://www.flagistrany.ru/data/flags/normal/cn.png"));
        countries.add(new Country("Кыргызстан", "Бишкек",
                "https://grs.gov.kg/uploads/state_symbols/flag_standart.png"));
        countries.add(new Country("Таиланд", "Бангкок",
                "https://flagshub.com/images/flag-of-thailand.png"));
        countries.add(new Country("Япония", "Токио",
                "https://flagof.ru/wp-content/uploads/2018/10/yaponii-flag.png"));
        countries.add(new Country("Армения", "Ереван",
                "https://upload.wikimedia.org/wikipedia/commons/e/e7/Flag_of_Armenia.png"));
    }



    private void loadData2(){
        countries = new ArrayList<>();
        countries.add(new Country("Германия", "Берлин",
                "https://www.flagistrany.ru/data/flags/ultra/de.png"));
        countries.add(new Country("Италия", "Рим",
                "https://w7.pngwing.com/pngs/907/428/png-transparent-flag-of-italy-italian-german-italia-flag-miscellaneous-angle-flag.png"));
        countries.add(new Country("Франция", "Париж",
                "https://cdn.pixabay.com/photo/2013/07/13/14/15/france-162295__480.png"));
        countries.add(new Country("Украина", "Киев",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/Flag_of_Ukraine.png/800px-Flag_of_Ukraine.png"));
        countries.add(new Country("Нидерланды", " Амстердам",
                "https://img5.goodfon.ru/wallpaper/nbig/1/ce/holland-netherlands-flag-of-netherlands-dutch-flag-flag.jpg"));
    }

    private void loadData3(){
        countries = new ArrayList<>();
        countries.add(new Country("США", "Вашингтон",
                "https://pngicon.ru/file/uploads/Flag-SShA.png"));
        countries.add(new Country("Канада", "Оттава",
                "https://flagof.ru/wp-content/uploads/2018/10/1200px-Flag_of_Canada_1964.svg_.png"));
        countries.add(new Country("Мексика", "Мехико",
                "https://www.flagistrany.ru/data/flags/ultra/mx.png"));
        countries.add(new Country("Ямайка", " Кингстон",
                "https://www.flagistrany.ru/data/flags/ultra/jm.png"));
        countries.add(new Country("Панама", "Панама",
                "https://www.flagistrany.ru/data/flags/ultra/pa.png"));
    }

    private void loadData4(){
        countries = new ArrayList<>();
        countries.add(new Country("Бразилия", "Бразилиа",
                "https://www.flagistrany.ru/data/flags/ultra/br.png"));
        countries.add(new Country("Аргентина", " Буэнос-Айрес",
                "https://flags-world.com/wp-content/uploads/2021/01/flag-argentiny-5.png"));
        countries.add(new Country("Перу", "Лима",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/d/df/Flag_of_Peru_%28state%29.svg/1200px-Flag_of_Peru_%28state%29.svg.png"));
        countries.add(new Country("Чили", " Сантьяго",
                "https://www.flagistrany.ru/data/flags/ultra/cl.png"));
        countries.add(new Country("Боливия", " Сукре",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Flag_of_Bolivia_%28state%29.svg/1280px-Flag_of_Bolivia_%28state%29.svg.png"));
    }

    private void loadData5(){
        countries = new ArrayList<>();
        countries.add(new Country("Нигерия", " Абуджа",
                "https://simvolplus.ru/upload/iblock/309/3095b7f3469d923e20c2a39eadb066b8.jpg"));
        countries.add(new Country("Кения", "Найроби",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Flag_of_Kenya.svg/1280px-Flag_of_Kenya.svg.png"));
        countries.add(new Country("Марокко", " Рабат",
                "https://flagi.in.ua/images/tovari/585/flag-marokko_b1.jpg"));
        countries.add(new Country("Танзания", " Додома",
                "https://cdn.pixabay.com/photo/2013/07/12/14/44/africa-148711_640.png"));
        countries.add(new Country("Ангола", " Луанда",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/Flag_of_Angola.svg/250px-Flag_of_Angola.svg.png"));
    }

    private void loadData6(){
        countries = new ArrayList<>();
        countries.add(new Country("Австралия", " Канберра",
                "https://img2.freepng.ru/20180601/slh/kisspng-flag-of-australia-national-flag-flag-of-new-zealan-australia-5b11477ba706a4.6021635315278590676842.jpg"));

    }

    @Override
    public void onItemClick(int position) {
      switch (position){
          case 0 :
              loadData();
              break;
          case 1 :
              loadData2();
              break;
          case 2 :
              loadData3();
              break;
          case 3 :
              loadData4();
              break;
          case 4 :
              loadData5();
              break;
          case 5 :
              loadData6();
              break;

      }
    }
}