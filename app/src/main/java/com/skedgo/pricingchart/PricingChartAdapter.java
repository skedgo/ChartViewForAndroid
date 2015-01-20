package com.skedgo.pricingchart;

import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nguyen Cong Trung on 1/19/2015.
 */
public class PricingChartAdapter extends RecyclerView.Adapter<ChartViewHolder> {

    List<Double> values;

    public PricingChartAdapter() {
        this.values = new ArrayList<>();
    }

    @Override
    public ChartViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.chart_item_view, null, false);

        return new ChartViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ChartViewHolder chartViewHolder, final int i) {
        final ViewTreeObserver viewTreeObserver = chartViewHolder.tvItemViewBg.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                double currentVal = values.get(i);
                int bgHeight = chartViewHolder.tvItemViewBg.getHeight();
                int valueHeight = (int) (bgHeight * currentVal);

                ViewGroup.LayoutParams valueViewParams = chartViewHolder.tvItemValueView.getLayoutParams();
                valueViewParams.height = valueHeight;
                chartViewHolder.tvItemValueView.setLayoutParams(valueViewParams);

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    chartViewHolder.tvItemViewBg.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    chartViewHolder.tvItemViewBg.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    public void setData(List<Double> values) {
        this.values.clear();
        this.values.addAll(values);
        notifyDataSetChanged();
    }
}
