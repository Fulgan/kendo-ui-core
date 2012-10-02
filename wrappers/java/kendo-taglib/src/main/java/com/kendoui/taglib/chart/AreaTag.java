
package com.kendoui.taglib.chart;

import com.kendoui.taglib.BaseTag;

import javax.servlet.jsp.JspException;

@SuppressWarnings("serial")
public class AreaTag extends BaseTag /* interfaces */implements Border/* interfaces */ {

//>> Attributes

    @Override
    public int doEndTag() throws JspException {
        Area parent = (Area)findParentWithClass(Area.class);

        parent.setArea(this);

        return EVAL_PAGE;
    }

    @Override
    public void setBorder(BorderTag value) {
        setProperty("border", value);
    }

    public String getBackground() {
        return (String)getProperty("background");
    }

    public void setBackground(String value) {
        setProperty("background", value);
    }

    public int getOpacity() {
        return (int)getProperty("opacity");
    }

    public void setOpacity(int value) {
        setProperty("opacity", value);
    }

    public int getHeight() {
        return (int)getProperty("height");
    }

    public void setHeight(int value) {
        setProperty("height", value);
    }

    public int getMargin() {
        return (int)getProperty("margin");
    }

    public void setMargin(int value) {
        setProperty("margin", value);
    }

    public int getWidth() {
        return (int)getProperty("width");
    }

    public void setWidth(int value) {
        setProperty("width", value);
    }

//<< Attributes
}
