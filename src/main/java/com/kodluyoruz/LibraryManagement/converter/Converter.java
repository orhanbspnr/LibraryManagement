package com.kodluyoruz.LibraryManagement.converter;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public abstract class Converter<S,T> {
    public List<T> convertToList(List<S> sourceList){
        ArrayList<T> targetList = new ArrayList<>();
        for (S source : sourceList) {
           T target = convert(source);
           targetList.add(target);
        }
        return targetList;
    }
    public abstract T convert(S source);
}
