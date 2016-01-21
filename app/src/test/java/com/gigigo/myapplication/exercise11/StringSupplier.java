package com.gigigo.myapplication.exercise11;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

import java.util.ArrayList;
import java.util.List;

public class StringSupplier extends ParameterSupplier {
    @Override
    public List<PotentialAssignment> getValueSources(ParameterSignature sig) throws Throwable {
        List<PotentialAssignment> list = new ArrayList<>();
        list.add(PotentialAssignment.forValue("String", " Hola "));
        list.add(PotentialAssignment.forValue("String", " Mundo "));
        return list;
    }
}
