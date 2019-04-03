// LineChartExampleData.java

// Generated by https://quicktype.io
//
// To change quicktype's target language, run command:
//
//   "Set quicktype target language"
package csumbcapstonegroup22spring2019.demodb.entities.linechart;


public class LineChart {
    private String id;
    private String name;
    private Series[] series;

    public LineChart(String name, Series[] series) {
        this.name = name;
        this.series = series;
    }

    public String getId() { 
        return id; 
    }

    public void setId(String id) { 
        this.id = id; 
    }
    
    public String getName() { 
        return name; 
    }

    public void setName(String value) { 
        this.name = value; 
    }

    public Series[] getSeries() { 
        return series; 
    }

    public void setSeries(Series[] value) {
         this.series = value; 
    }
}

