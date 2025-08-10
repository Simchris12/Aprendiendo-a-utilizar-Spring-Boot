package com.aluracursos.screenmatch.service;

public interface IConvierteDatos {
    <T> T obteberDatos(String json, Class<T> clase);
}
