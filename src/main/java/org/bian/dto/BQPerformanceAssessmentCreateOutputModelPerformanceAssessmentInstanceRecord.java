package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPerformanceAssessmentCreateOutputModelPerformanceAssessmentInstanceRecord
 */
public class BQPerformanceAssessmentCreateOutputModelPerformanceAssessmentInstanceRecord   {
  private String performanceAssessmentWorkTaskType = null;

  private String performanceAssessmentWorkTask = null;

  private String performanceAssessmentWorkTaskWorkProducts = null;

  private String performanceAssessmentWorkTaskResult = null;

  private String performanceAssessmentWorkTaskDateTime = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of work task (e.g. track competitor activity, track customer behaviors) 
   * @return performanceAssessmentWorkTaskType
  **/

  public String getPerformanceAssessmentWorkTaskType() {
    return performanceAssessmentWorkTaskType;
  }

  public void setPerformanceAssessmentWorkTaskType(String performanceAssessmentWorkTaskType) {
    this.performanceAssessmentWorkTaskType = performanceAssessmentWorkTaskType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The make-up of the market tracking task performed, includes consolidation and analysis of market research to reach specific insights 
   * @return performanceAssessmentWorkTask
  **/

  public String getPerformanceAssessmentWorkTask() {
    return performanceAssessmentWorkTask;
  }

  public void setPerformanceAssessmentWorkTask(String performanceAssessmentWorkTask) {
    this.performanceAssessmentWorkTask = performanceAssessmentWorkTask;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated notes, evaluations and findings for the work task 
   * @return performanceAssessmentWorkTaskWorkProducts
  **/

  public String getPerformanceAssessmentWorkTaskWorkProducts() {
    return performanceAssessmentWorkTaskWorkProducts;
  }

  public void setPerformanceAssessmentWorkTaskWorkProducts(String performanceAssessmentWorkTaskWorkProducts) {
    this.performanceAssessmentWorkTaskWorkProducts = performanceAssessmentWorkTaskWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the outcome or result of the work task - indication of the need to amend, redirect and/or expand customer campaign activity 
   * @return performanceAssessmentWorkTaskResult
  **/

  public String getPerformanceAssessmentWorkTaskResult() {
    return performanceAssessmentWorkTaskResult;
  }

  public void setPerformanceAssessmentWorkTaskResult(String performanceAssessmentWorkTaskResult) {
    this.performanceAssessmentWorkTaskResult = performanceAssessmentWorkTaskResult;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date-time the performance assessment task is performed 
   * @return performanceAssessmentWorkTaskDateTime
  **/

  public String getPerformanceAssessmentWorkTaskDateTime() {
    return performanceAssessmentWorkTaskDateTime;
  }

  public void setPerformanceAssessmentWorkTaskDateTime(String performanceAssessmentWorkTaskDateTime) {
    this.performanceAssessmentWorkTaskDateTime = performanceAssessmentWorkTaskDateTime;
  }


}

