package org.ieschabas.views.actores;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;
import org.ieschabas.clases.Actor;
import org.ieschabas.clases.Pelicula;
import org.ieschabas.views.MainLayout;

@PageTitle("Actores")
@Route(value = "Actores", layout = MainLayout.class)
public class ActoresView extends VerticalLayout {

    public ActoresView() {
        setSpacing(false);
        Actor actor = new Actor();
        Grid<Actor> tabla = new Grid<>();
        tabla.addColumn(Actor::getId).setHeader("Id");
        tabla.addColumn(Actor::getNombre).setHeader("Nombre");
        tabla.addColumn(Actor::getApellidos).setHeader("Apellidos");
        tabla.addColumn(Actor::getPais).setHeader("País");
        tabla.addColumn(Actor::getAnyoNacimiento).setHeader("Año de nacimiento");
        tabla.addColumn(Actor::getRol).setHeader("Rol");
        add(tabla);

    }

}
