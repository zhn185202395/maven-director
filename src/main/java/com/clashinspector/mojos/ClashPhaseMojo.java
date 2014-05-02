package com.clashinspector.mojos;



import com.clashinspector.DependencyService;
import com.clashinspector.model.ClashCollectResultWrapper;
<<<<<<< HEAD
import com.clashinspector.model.OuterVersionClash;
=======
>>>>>>> FETCH_HEAD
import com.clashinspector.visualize.ConsoleVisualizer;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.eclipse.aether.artifact.Artifact;
import org.eclipse.aether.artifact.DefaultArtifact;

<<<<<<< HEAD

import java.util.List;

/**
 * [Definition of Phase Mojo]
 */

@Mojo(name = "listPhase", requiresProject = true, defaultPhase = LifecyclePhase.COMPILE)
public class ClashPhaseMojo extends AbstractClashMojo {

  @Parameter( alias = "failOnClash", defaultValue = "true", property = "failOnClash")
  private String failOnClash;

  @Parameter( alias = "whiteList", property = "whiteList")
  private List<WhiteListDependency> whiteList;



=======
/**
 * [Definition of Phase Mojo]
 */
//clashinspector
//clashfinder
@Mojo(name = "listPhase", requiresProject = true, defaultPhase = LifecyclePhase.COMPILE)
public class ClashPhaseMojo extends AbstractClashMojo {

  @Parameter( alias = "failOnError", defaultValue = "true", property = "failOnError")
  private String failOnError;
>>>>>>> FETCH_HEAD

  @Override
  public void execute() throws MojoExecutionException, MojoFailureException {

    super.execute();
<<<<<<< HEAD
    super.printStartParameter( "listPhase" , "failOnClash = " +this.getFailOnClash() );

    Artifact artifact;
    try {

=======
    super.printStartParameter( "listPhase" , "failOnError = " +this.getFailOnError() );

    Artifact artifact;
    try {
      this.getLog().info("");
      this.getLog().info( "Starting goal :listPhase with parameters: " +  super.getStartParameter());
      this.getLog().info("");
>>>>>>> FETCH_HEAD

      artifact = new DefaultArtifact( this.getProject().getArtifact().toString() );


      DependencyService dependencyService = new DependencyService();

      ConsoleVisualizer consoleVisualizer = new ConsoleVisualizer();

      ClashCollectResultWrapper clashCollectResultWrapper = new ClashCollectResultWrapper( dependencyService.getDependencyTree( artifact, this.getRepoSession(), this.getRepoSystem(), this.getIncludedScopesList(), this.getExcludedScopesList(), this.isIncludeOptional() ) );


      consoleVisualizer.visualize( clashCollectResultWrapper, this.getSeverity(), this );
<<<<<<< HEAD



      if ( this.getFailOnClash() && clashCollectResultWrapper.getNumberOfOuterClashesForSeverityLevel( this.getSeverity())>0 ) {



          //if every outer version clash is in the whiteList, then no Excpetion has to be thrown
        for(OuterVersionClash outerVersionClash: clashCollectResultWrapper.getOuterVersionClashList())
        {

          if(outerVersionClash.hasAllInnerClashesInWhiteList( whiteList )==false)
          {
            throw new MojoExecutionException( "Version Clashes for Detection-Level " + this.getSeverity() + " detected!!" );
          }
        }

                       //beim failen muss die white liste berücksichtigt werden

=======
      if ( this.getFailOnError() && clashCollectResultWrapper.getNumberOfOuterClashesForSeverityLevel( this.getSeverity())>0 ) {
        throw new MojoExecutionException( "Version Clashes for Detection-Level " + this.getSeverity() + " detected!!" );


>>>>>>> FETCH_HEAD
      }


    } catch ( IllegalArgumentException e ) {
      throw new MojoFailureException( e.getMessage(), e );
    }

  }

<<<<<<< HEAD
   //Searching for entrys in whitelist
  private void resolveWhiteList ()
  {

  }

  public boolean getFailOnClash(){
    return Boolean.valueOf( failOnClash );
=======
  public boolean getFailOnError(){
    return Boolean.valueOf(failOnError);
>>>>>>> FETCH_HEAD
  }

}


