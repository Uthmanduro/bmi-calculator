package com.example.bmi_calculator.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.bmi_calculator.model.Person;
import com.example.bmi_calculator.model.Bmi;

import java.util.Locale;

@Service
public class userService {

    public Bmi calculateBMI(Person person) {

        double bmiValue;
        String unit = person.getUnit().toLowerCase();

        if ("metric".equals(unit)) {
            bmiValue = person.getWeight() / (person.getHeight() * person.getHeight());
        } else if (unit.equals("imperial")) {
            bmiValue = (person.getWeight() * 703) / (person.getHeight() * person.getHeight());
        } else {
            throw new IllegalArgumentException("Invalid unit. Use 'metric' or 'imperial'.");
        }

        String category = categorizeBmi(bmiValue);
        return new Bmi(Math.round(bmiValue * 100.0) / 100.0, category, person.getName());
    }

    private String categorizeBmi(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obesity";
    }
}
