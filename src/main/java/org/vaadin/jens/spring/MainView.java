package org.vaadin.jens.spring;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * The main view contains a simple label element and a template element.
 */
@HtmlImport("styles/shared-styles.html")
@Route
public class MainView extends VerticalLayout {

    public MainView() {
        setClassName("main-layout");

        //Just to add some content on the page to test relative position
        for (int i = 0; i<5; i++){
            add(new Div(new Text("Hello")));
        }

        // A 400x250 pixels size layout
        AbsoluteLayout layout = new AbsoluteLayout();
        layout.setWidth("400px");
        layout.setHeight("250px");

        // A component with coordinates for its top-left corner
        TextField text = new TextField("Somewhere someplace");
        layout.add(text, 50, 50);
        add(layout);
    }

}
