package com.testing;

import com.testing.printtopviewtree.PrintTopViewofTree;
import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

//@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class PrintTopViewofTree_ESTest{// extends com.testing.PrintTopViewofTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[7];
      PrintTopViewofTree.main(stringArray0);
      assertEquals(7, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PrintTopViewofTree printTopViewofTree0 = new PrintTopViewofTree();
  }
}