package com.ypy.domain;

public class PC implements Equipment {
    private String model;
    private String display;
    public PC()
    {
        super();
    }
    public PC(String model,String display){
        super();
        this.model=model;
        this.display=display;
    }
    public void setModel(String model) {
        this.model=model;
    }
    public String getModel()
    {
        return this.model;
    }
    public void setdisplay(String display) {
        this.model=display;
    }
    public String getdisplay()
    {
        return this.display;
    }
    @Override
    public String getDescription() {
        return model+ "（" + display + "）";
    }
    public String toString(){
         return model+ "（" + display + "）";
    }

    
}
