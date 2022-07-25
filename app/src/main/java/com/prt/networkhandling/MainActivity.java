package com.prt.networkhandling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import org.json.JSONStringer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        printJsonToObject();
    }

    private void printObjectListToJson() {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car(0, "Porsche", "911", "Yellow", "Sedan");
        Car car2 = new Car(1, "Ferrari", "La ferrari", "Red", "Sport");
        cars.add(car1);
        cars.add(car2);

        Gson gson = new Gson();
        String json = gson.toJson(cars);
        Log.d("TEST_TAG", json);
    }

    private void printObjectToJson() {
        List<Object> strs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            List<String> secondList = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                secondList.add("secondListItem " + j);
            }
            strs.add(secondList);
        }

        Gson gson = new Gson();
        String json = gson.toJson(strs);
        Log.d("TEST_TAG", json);
    }

    private void printJsonToObject() {
        String jsonString = "[\n" +
                "  {\n" +
                "    \"name\": \"Meowsy\",\n" +
                "    \"species\" : \"cat\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Barky\",\n" +
                "    \"species\" : \"dog\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\": \"Purrpaws\",\n" +
                "    \"species\" : \"cat\"\n" +
                "  }\n" +
                "]";

        Gson gson = new Gson();
        List<Animal> list = gson.fromJson(jsonString, new TypeToken<ArrayList<Animal>>() {
        }.getType());
        StringBuilder builder = new StringBuilder();
        for (Animal animal : list) {
            builder.append(animal.name).append(", ").append(animal.species).append("\n");
        }
        Log.d("TEST_TAG", builder.toString());
    }

    public class Animal {
        public String name;
        public String species;

        public Animal(String name, String species) {
            this.name = name;
            this.species = species;
        }
    }
}