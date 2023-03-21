package org.ieschabas.views.directores;

import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;
import org.ieschabas.clases.Actor;
import org.ieschabas.clases.Director;
import org.ieschabas.views.MainLayout;

@PageTitle("Directores")
@Route(value = "Directores", layout = MainLayout.class)
public class DirectoresView extends VerticalLayout {

    public DirectoresView() {
        setSpacing(false);
        Director director = new Director();
        Grid<Director> tabla = new Grid<>();
        tabla.addColumn(Director::getId).setHeader("Id");
        tabla.addColumn(Director::getNombre).setHeader("Nombre");
        tabla.addColumn(Director::getApellidos).setHeader("Apellidos");
        tabla.addColumn(Director::getPais).setHeader("País");
        tabla.addColumn(Director::getAnyoNacimiento).setHeader("Año de nacimiento");
        tabla.addColumn(Director::getRol).setHeader("Rol");
        add(tabla);
        FormLayout formulario = new FormLayout();
    }
}
