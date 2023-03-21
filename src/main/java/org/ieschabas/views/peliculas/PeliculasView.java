package org.ieschabas.views.peliculas;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;
import org.ieschabas.clases.Actor;
import org.ieschabas.clases.Pelicula;
import org.ieschabas.librerias.GestorPeliculas;
import org.ieschabas.views.MainLayout;


@PageTitle("Peliculas")
@Route(value = "Peliculas", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class PeliculasView extends VerticalLayout {

    public PeliculasView() {
        setSpacing(false);
        Pelicula pelicula = new Pelicula();
        Grid<Pelicula> tabla = new Grid<>();
        tabla.addColumn(Pelicula::getId).setHeader("Id");
        tabla.addColumn(Pelicula::getTitulo).setHeader("Título");
        tabla.addColumn(Pelicula::getDescripcion).setHeader("Descripción");
        tabla.addColumn(Pelicula::getAnyoPublicacion).setHeader("Año de publicación");
        tabla.addColumn(Pelicula::getDuracion).setHeader("Duración");
        tabla.addColumn(Pelicula::getCategoria).setHeader("Categoría");
        tabla.addColumn(Pelicula::getFormato).setHeader("Formato");
        tabla.addColumn(Pelicula::getValoracion).setHeader("Valoración");
        add(tabla);
        tabla.setItems();

        FormLayout formulario = new FormLayout();

        TextField titulo = new TextField("Título");
        TextField descripcion = new TextField("Descripción");
        TextField anyoPublicacion = new TextField("Año de publicación");
        TextField duracion = new TextField("Duración");
        TextField categoria = new TextField("Categoría");
        TextField formato = new TextField("Formato");
        TextField valoracion = new TextField("Valoración");
        Button enviar = new Button("Enviar");
        formulario.add(titulo, descripcion, anyoPublicacion, duracion, categoria, formato, valoracion, enviar);
        add(formulario);

        Binder<Pelicula> binder = new Binder<>(Pelicula.class);
    }




}
