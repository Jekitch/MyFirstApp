package com.example.myfirstapp

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        //my code
        """
        1. работой с преобразованием строк
        2. базовой арифметикой и выводом результата в консоль
        3. примерами интерполяции сток
        4. преобразованием типов
        5. примером условных операторов (if else) 
        6. примером с циклами (for while) 
        7. примером создания отдельной функции
        8. примером работы с массивом
    """
        //1
            var data : String; data = "hello world!";
            data = data.substring(1..7).toUpperCase();
            println(data)
        //2
            var a = 90; var b = 10; println("a+b = ${a+b}; a*b = ${a*b}; a/b = ${a/b}; a-b = ${a-b}; ")
        //3
            var content = "world!"; println("hello ${content}");
        //4
            var STRINGVAR : String = "1234"; println( (STRINGVAR.toInt() - 1000).toString() );
        //5
            var BOOL = false;
            if (BOOL) { println("1 Is True"); } else { println("1 Is False"); }
            BOOL = true;
            if (BOOL) { println("2 Is True"); } else { println("2 Is False"); }
            //6.1
            var I : Int = 0;
            while (I < 10) { print(I); I++; }
            println("");
        //6.2
            for (i in 1..10) { print(i); }
        //7
            fun FUCT(x: Int) : String { var res = 1; for (i in 1..x) { res *= i; }; return "\nфакториал ${x} равен ${res}" }
            println(FUCT(5))
        //8
            var array = arrayOf("h", "e", "l", "l", "o", " ", "w", "o", "r", "l", "d");
            var array0 = Array(2, {20});
            println()
            array[4] = "HELLO"; array[6] = "WORLD";
            println(array.size)
            println(array[4] + " " + array[6])
            var res = 0;
            for (i in array0) { res += i; }; println(res);
    }
}
