package chart;

import java.util.List;

public class BarChartBuilder {
    private String title;
    private String fontName;
    private int fontSize;
    private String fontColor;
    private int width;
    private int height;
    private String backgroundColor;
    private List<String> data;
    private boolean displayTitle;
    private boolean displayLegend;

    public BarChartBuilder() {
    }

    public BarChartBuilder withTitle(String title){
        this.title = title;
        return this;
    }
    public BarChartBuilder withFontName(String fontName){
        this.fontName = fontName;
        return this;
    }
    public BarChartBuilder withFontSize(int fontSize){
        this.fontSize=fontSize;
        return this;
    }
    public BarChartBuilder withfontColor(String fontColor){
        this.fontColor=fontColor;
        return this;
    }
    public BarChartBuilder withTittle(String title){
        this.title = title;
        return this;
    }
    public BarChartBuilder withWidth(int width){
        this.width = width;
        return this;
    }
    public BarChartBuilder withHeight(int height){
        this.height = height;
        return this;
    }
    public BarChartBuilder withHeight(String backgroundColor){
        this.backgroundColor = backgroundColor;
        return this;
    }
    public BarChartBuilder withDate(List<String> data){
        this.data = data;
        return this;
    }
    public BarChartBuilder withDisplayTitle(boolean displayTitle){
        this.displayTitle = displayTitle;
        return this;
    }
    public BarChartBuilder withDisplayLegend(boolean displayLegend){
        this.displayLegend = displayLegend;
        return this;
    }


}
