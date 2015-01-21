package com.skedgo.pricingchart;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.skedgo.chartviewlibrary.R;

/**
 * Created by Nguyen Cong Trung on 1/19/2015.
 */
class ChartViewHolder extends RecyclerView.ViewHolder {

    TextView tvItemViewBg;
    TextView tvItemValueView;

    public ChartViewHolder(View itemView) {
        super(itemView);
        tvItemViewBg = (TextView) itemView.findViewById(R.id.item_view_bg);
        tvItemValueView = (TextView) itemView.findViewById(R.id.item_view_value);
    }
}
