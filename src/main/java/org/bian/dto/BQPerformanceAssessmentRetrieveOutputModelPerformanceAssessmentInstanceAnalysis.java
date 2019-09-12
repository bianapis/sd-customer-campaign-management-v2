package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPerformanceAssessmentRetrieveOutputModelPerformanceAssessmentInstanceAnalysis
 */
public class BQPerformanceAssessmentRetrieveOutputModelPerformanceAssessmentInstanceAnalysis   {
  private Object performanceAssessmentInstanceAnalysisRecord = null;

  private String performanceAssessmentInstanceAnalysisReportType = null;

  private String performanceAssessmentInstanceAnalysisParameters = null;

  private Object performanceAssessmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return performanceAssessmentInstanceAnalysisRecord
  **/

  public Object getPerformanceAssessmentInstanceAnalysisRecord() {
    return performanceAssessmentInstanceAnalysisRecord;
  }

  public void setPerformanceAssessmentInstanceAnalysisRecord(Object performanceAssessmentInstanceAnalysisRecord) {
    this.performanceAssessmentInstanceAnalysisRecord = performanceAssessmentInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return performanceAssessmentInstanceAnalysisReportType
  **/

  public String getPerformanceAssessmentInstanceAnalysisReportType() {
    return performanceAssessmentInstanceAnalysisReportType;
  }

  public void setPerformanceAssessmentInstanceAnalysisReportType(String performanceAssessmentInstanceAnalysisReportType) {
    this.performanceAssessmentInstanceAnalysisReportType = performanceAssessmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return performanceAssessmentInstanceAnalysisParameters
  **/

  public String getPerformanceAssessmentInstanceAnalysisParameters() {
    return performanceAssessmentInstanceAnalysisParameters;
  }

  public void setPerformanceAssessmentInstanceAnalysisParameters(String performanceAssessmentInstanceAnalysisParameters) {
    this.performanceAssessmentInstanceAnalysisParameters = performanceAssessmentInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return performanceAssessmentInstanceAnalysisReport
  **/

  public Object getPerformanceAssessmentInstanceAnalysisReport() {
    return performanceAssessmentInstanceAnalysisReport;
  }

  public void setPerformanceAssessmentInstanceAnalysisReport(Object performanceAssessmentInstanceAnalysisReport) {
    this.performanceAssessmentInstanceAnalysisReport = performanceAssessmentInstanceAnalysisReport;
  }


}

