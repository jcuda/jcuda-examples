package org.jcuda.example.maven;

import jcuda.*;
import jcuda.runtime.*;
import jcuda.driver.*;
import jcuda.jcublas.*;
import jcuda.jcufft.*;
import jcuda.jcusparse.*;
import jcuda.jcurand.*;
import jcuda.jcusolver.*;
import jcuda.jcudnn.*;

public class JCudaExampleMaven
{
    public static void main(String args[])
    {
        // Call one method on each class, causing the class
        // and its native library to be loaded
        JCuda.setExceptionsEnabled(true);
        JCudaDriver.setExceptionsEnabled(true);
        JCublas.setExceptionsEnabled(true);
        JCublas2.setExceptionsEnabled(true);
        JCufft.setExceptionsEnabled(true);
        JCusparse.setExceptionsEnabled(true);
        JCurand.setExceptionsEnabled(true);
        JCusolver.setExceptionsEnabled(true);

        // JCudnn requires the CUDNN library to be in a visible path!
        JCudnn.setExceptionsEnabled(true);

        Pointer pointer = new Pointer();
        JCuda.cudaMalloc(pointer, 4);
        System.out.println("Pointer: "+pointer);
        JCuda.cudaFree(pointer);
    }
}
