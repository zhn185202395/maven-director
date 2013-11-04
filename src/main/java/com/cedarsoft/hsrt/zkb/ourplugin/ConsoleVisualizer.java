package com.cedarsoft.hsrt.zkb.ourplugin;

import com.google.common.base.Strings;
import org.apache.maven.plugin.logging.Log;
import org.eclipse.aether.collection.CollectResult;
import org.eclipse.aether.graph.DependencyNode;


import java.util.List;

/**
* Created with IntelliJ IDEA.
* User: m
* Date: 01.11.13
* Time: 12:05
* To change this template use File | Settings | File Templates.
*/
public class ConsoleVisualizer {



  private void printNode(DependencyNode dependencyNode,int depth)
  {
    for ( DependencyNode dN : dependencyNode.getChildren() ) {
      System.out.println( Strings.repeat( "  ", depth )+ dN.toString() );
        this.printNode( dN ,depth+1);
    }
  }

  public void visualize(CollectResult collectResult, Log log)
  {

    printNode( collectResult.getRoot(),0);


    }


}
