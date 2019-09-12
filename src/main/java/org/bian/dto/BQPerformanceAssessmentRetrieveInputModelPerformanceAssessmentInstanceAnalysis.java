package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPerformanceAssessmentRetrieveInputModelPerformanceAssessmentInstanceAnalysis
 */
public class BQPerformanceAssessmentRetrieveInputModelPerformanceAssessmentInstanceAnalysis   {
  private String performanceAssessmentInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return performanceAssessmentInstanceAnalysisReference
  **/

  public String getPerformanceAssessmentInstanceAnalysisReference() {
    return performanceAssessmentInstanceAnalysisReference;
  }

  public void setPerformanceAssessmentInstanceAnalysisReference(String performanceAssessmentInstanceAnalysisReference) {
    this.performanceAssessmentInstanceAnalysisReference = performanceAssessmentInstanceAnalysisReference;
  }


}

