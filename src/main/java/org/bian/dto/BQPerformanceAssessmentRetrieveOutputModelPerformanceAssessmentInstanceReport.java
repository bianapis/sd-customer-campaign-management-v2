package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPerformanceAssessmentRetrieveOutputModelPerformanceAssessmentInstanceReport
 */
public class BQPerformanceAssessmentRetrieveOutputModelPerformanceAssessmentInstanceReport   {
  private Object performanceAssessmentInstanceReportRecord = null;

  private String performanceAssessmentInstanceReportType = null;

  private String performanceAssessmentInstanceReportParameters = null;

  private Object performanceAssessmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return performanceAssessmentInstanceReportRecord
  **/

  public Object getPerformanceAssessmentInstanceReportRecord() {
    return performanceAssessmentInstanceReportRecord;
  }

  public void setPerformanceAssessmentInstanceReportRecord(Object performanceAssessmentInstanceReportRecord) {
    this.performanceAssessmentInstanceReportRecord = performanceAssessmentInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return performanceAssessmentInstanceReportType
  **/

  public String getPerformanceAssessmentInstanceReportType() {
    return performanceAssessmentInstanceReportType;
  }

  public void setPerformanceAssessmentInstanceReportType(String performanceAssessmentInstanceReportType) {
    this.performanceAssessmentInstanceReportType = performanceAssessmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return performanceAssessmentInstanceReportParameters
  **/

  public String getPerformanceAssessmentInstanceReportParameters() {
    return performanceAssessmentInstanceReportParameters;
  }

  public void setPerformanceAssessmentInstanceReportParameters(String performanceAssessmentInstanceReportParameters) {
    this.performanceAssessmentInstanceReportParameters = performanceAssessmentInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return performanceAssessmentInstanceReport
  **/

  public Object getPerformanceAssessmentInstanceReport() {
    return performanceAssessmentInstanceReport;
  }

  public void setPerformanceAssessmentInstanceReport(Object performanceAssessmentInstanceReport) {
    this.performanceAssessmentInstanceReport = performanceAssessmentInstanceReport;
  }


}

