package com.skedgo.pricingchart;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

import java.util.List;
import java.util.logging.Handler;

/**
 * Created by Nguyen Cong Trung on 1/19/2015.
 */
public class PricingChart extends RecyclerView {

    private PricingChartAdapter pricingChartAdapter;

    // -- CONSTRUCTORS
    public PricingChart(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initialize(context);
    }

    public PricingChart(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize(context);
    }

    public PricingChart(Context context) {
        super(context);
        initialize(context);
    }
    // -- END OF CONSTRUCTORS

    // -- HELPER METHODS
    private void initialize(Context context) {
        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        setLayoutManager(layoutManager);
        pricingChartAdapter = new PricingChartAdapter();
        setAdapter(pricingChartAdapter);
    }
    // -- END OF HELPER METHODS

    // -- PUBLIC METHODS
    public void setData(List<Double> values) {
        pricingChartAdapter.setData(values);
        setAdapter(pricingChartAdapter);
    }
    // -- END OF PUBLIC METHODS
}
