package org.example.service;


public interface IRegistrationService<T> {
    void save(T item);
    void displayAll();
    void update(String id, String newName);
    void remove(String id);
}