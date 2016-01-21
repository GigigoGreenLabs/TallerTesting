package com.gigigo.myapplication.exercise11;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

import java.util.ArrayList;
import java.util.List;

public class NumberSupplier extends ParameterSupplier {

    @Override
    public List<PotentialAssignment> getValueSources(ParameterSignature sig) throws Throwable {
        List<PotentialAssignment> list = new ArrayList<>();
        list.add(PotentialAssignment.forValue("long", 2));
        list.add(PotentialAssignment.forValue("float", 3f));
        list.add(PotentialAssignment.forValue("double", 4.0));
        return list;
    }
}