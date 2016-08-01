package com.example.taf.widgets;

import com.example.taf.widgets.impl.AbstractWidgetImpl;
import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WidgetObject;

@ImplementedBy(AbstractWidgetImpl.class)
public interface AbstractWidget extends WidgetObject {
}