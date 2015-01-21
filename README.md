# About

This is a simple custom view that help you create columns charts in you Android application.

# How to use

This project includes two parts, library project and demo project. You can pull this project 
and run it as normal Android application to see how it works. To use the view in your project, you need:

  1. Copy the chartviewlibrary folder into your Android project and include it as a library.
  2. Add PricingChart to your xml layout file like this:
  
        <com.skedgo.pricingchart.PricingChart
            android:id="@+id/pricing_chart_view"
            android:layout_width="match_parent"
            android:layout_height="100dp"
            android:layout_centerInParent="true" />
    
  3. Refer that view in your java code and set its data by using its setData method. That method receives a 
  list of double values in the range from 0.0 to 1.0, which represent percent values.
  
# License
[Apache License, Version 2.0][License]

[License]: http://opensource.org/licenses/Apache-2.0
