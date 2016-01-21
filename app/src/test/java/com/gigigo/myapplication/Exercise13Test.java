package com.gigigo.myapplication;

import com.gigigo.myapplication.classes.Foo;

import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercise13Test {

    @Rule
    public ExpectedException exception = ExpectedException.none();

//    @Test
    public void testNone() throws Exception {
        exception.expect(NullPointerException.class);

        Foo foo = null;
        foo.setValue(1);
    }

//    @Test
    public void testIndexOutOfBoundsException() throws Exception {
        exception.expect(IndexOutOfBoundsException.class);
        exception.expectMessage("Index: 0, Size: 0");

        List a = new ArrayList();
        a.get(0);
    }

//    @Test
//    public void testIndexOutOfBoundsException1() throws Exception {
//        exception.expect(IndexOutOfBoundsException.class);
//        exception.expectMessage("Index: 1, Size: 0");
//
//        List a = new ArrayList();
//        a.get(0);
//    }

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

//    @Test
    public void testTemporaryFolfer() throws Exception {
        File newFile = temporaryFolder.newFile("newFile.txt");
        File newFolder = temporaryFolder.newFolder("newFolder");

        assertTrue(newFile.exists());
        assertTrue(newFolder.exists());

        assertEquals(newFile.getName(), "newFile.txt");
        assertEquals(newFolder.getName(), "newFolder");
    }


}
