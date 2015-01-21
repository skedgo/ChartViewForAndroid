package com.skedgo.pricingchart;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends ActionBarActivity {

    private PricingChart pricingChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pricingChart = (PricingChart) findViewById(R.id.pricing_chart_view);

        Random random = new Random();
        List<Double> data = new ArrayList<>(52);
        for (int i = 1; i <= 52; i++) {
            double aValue = random.nextDouble();
            if (aValue <= 0.3) {
                aValue += 0.3;
            }
            data.add(aValue);
        }

        pricingChart.setData(data);
    }
}
