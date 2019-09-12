package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAssessmentCreateOutputModelPerformanceAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPerformanceAssessmentCreateOutputModel
 */
public class BQPerformanceAssessmentCreateOutputModel   {
  private String performanceAssessmentInstanceReference = null;

  private String performanceAssessmentInitiateActionReference = null;

  private Object performanceAssessmentInitiateActionRecord = null;

  private String performanceAssessmentInstanceStatus = null;

  private BQPerformanceAssessmentCreateOutputModelPerformanceAssessmentInstanceRecord performanceAssessmentInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Performance Assessment instance 
   * @return performanceAssessmentInstanceReference
  **/

  public String getPerformanceAssessmentInstanceReference() {
    return performanceAssessmentInstanceReference;
  }

  public void setPerformanceAssessmentInstanceReference(String performanceAssessmentInstanceReference) {
    this.performanceAssessmentInstanceReference = performanceAssessmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return performanceAssessmentInitiateActionReference
  **/

  public String getPerformanceAssessmentInitiateActionReference() {
    return performanceAssessmentInitiateActionReference;
  }

  public void setPerformanceAssessmentInitiateActionReference(String performanceAssessmentInitiateActionReference) {
    this.performanceAssessmentInitiateActionReference = performanceAssessmentInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return performanceAssessmentInitiateActionRecord
  **/

  public Object getPerformanceAssessmentInitiateActionRecord() {
    return performanceAssessmentInitiateActionRecord;
  }

  public void setPerformanceAssessmentInitiateActionRecord(Object performanceAssessmentInitiateActionRecord) {
    this.performanceAssessmentInitiateActionRecord = performanceAssessmentInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Performance Assessment instance (e.g. initialised, pending, active) 
   * @return performanceAssessmentInstanceStatus
  **/

  public String getPerformanceAssessmentInstanceStatus() {
    return performanceAssessmentInstanceStatus;
  }

  public void setPerformanceAssessmentInstanceStatus(String performanceAssessmentInstanceStatus) {
    this.performanceAssessmentInstanceStatus = performanceAssessmentInstanceStatus;
  }


  /**
   * Get performanceAssessmentInstanceRecord
   * @return performanceAssessmentInstanceRecord
  **/

  public BQPerformanceAssessmentCreateOutputModelPerformanceAssessmentInstanceRecord getPerformanceAssessmentInstanceRecord() {
    return performanceAssessmentInstanceRecord;
  }

  public void setPerformanceAssessmentInstanceRecord(BQPerformanceAssessmentCreateOutputModelPerformanceAssessmentInstanceRecord performanceAssessmentInstanceRecord) {
    this.performanceAssessmentInstanceRecord = performanceAssessmentInstanceRecord;
  }


}

