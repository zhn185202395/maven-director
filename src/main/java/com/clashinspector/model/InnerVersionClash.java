package com.clashinspector.model;

import com.clashinspector.mojos.ClashSeverity;
<<<<<<< HEAD
<<<<<<< HEAD
import com.clashinspector.mojos.WhiteListDependency;

import java.util.List;
=======
>>>>>>> FETCH_HEAD
=======
import com.clashinspector.mojos.WhiteListDependency;

import java.util.List;
>>>>>>> d74048da3e5fb9ef92e4380dec3c213838faef73


public class InnerVersionClash {

  private final DependencyNodeWrapper usedDependencyNodeWrapper;
  private final DependencyNodeWrapper referredDependencyNodeWrapper;
  private final ClashSeverity clashSeverity;

  public InnerVersionClash( DependencyNodeWrapper usedDependencyNodeWrapper, DependencyNodeWrapper referredDependencyNodeWrapper ) {
    this.usedDependencyNodeWrapper = usedDependencyNodeWrapper;
    this.referredDependencyNodeWrapper = referredDependencyNodeWrapper;

    this.clashSeverity = this.referredDependencyNodeWrapper.getRelationShipToUsedVersion().getClashSeverity();

  }

  public boolean isClashForSeverityLevel( ClashSeverity clashSeverity ) {
    if ( this.clashSeverity.ordinal() >= clashSeverity.ordinal() ) {
      return true;
    } else {
      return false;
    }
  }

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d74048da3e5fb9ef92e4380dec3c213838faef73
  //Checks if the inner clash is in white list... if one dependency of the inner clah is in white list it gives back an true

  public boolean hasDependencyInWhiteList( List<WhiteListDependency> whiteList ) {
    boolean result = false;
    for (WhiteListDependency whiteListDependency : whiteList)
    {
          System.out.println("whiteListDependency:" + whiteListDependency.toString());
          System.out.println("usedDependencyNodeWrapper:" + usedDependencyNodeWrapper.toString());

         if(whiteListDependency.equals( usedDependencyNodeWrapper ) || whiteListDependency.equals( referredDependencyNodeWrapper ))
         {
          return true;
         }
    }
    return  result;
  }
<<<<<<< HEAD
=======
>>>>>>> FETCH_HEAD
=======
>>>>>>> d74048da3e5fb9ef92e4380dec3c213838faef73

  public DependencyNodeWrapper getUsedDependencyNodeWrapper() {
    return usedDependencyNodeWrapper;
  }

  public DependencyNodeWrapper getReferredDependencyNodeWrapper() {
    return referredDependencyNodeWrapper;
  }

  public ClashSeverity getClashSeverity() {
    return clashSeverity;
  }
}
