package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAssessmentCreateOutputModelPerformanceAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPerformanceAssessmentUpdateInputModel
 */
public class BQPerformanceAssessmentUpdateInputModel   {
  private String customerCampaignPortfolioManagementPlanInstanceReference = null;

  private String performanceAssessmentInstanceReference = null;

  private BQPerformanceAssessmentCreateOutputModelPerformanceAssessmentInstanceRecord performanceAssessmentInstanceRecord = null;

  private Object performanceAssessmentUpdateActionTaskRecord = null;

  private String performanceAssessmentUpdateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Campaign Portfolio Management Plan instance 
   * @return customerCampaignPortfolioManagementPlanInstanceReference
  **/

  public String getCustomerCampaignPortfolioManagementPlanInstanceReference() {
    return customerCampaignPortfolioManagementPlanInstanceReference;
  }

  public void setCustomerCampaignPortfolioManagementPlanInstanceReference(String customerCampaignPortfolioManagementPlanInstanceReference) {
    this.customerCampaignPortfolioManagementPlanInstanceReference = customerCampaignPortfolioManagementPlanInstanceReference;
  }


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
   * Get performanceAssessmentInstanceRecord
   * @return performanceAssessmentInstanceRecord
  **/

  public BQPerformanceAssessmentCreateOutputModelPerformanceAssessmentInstanceRecord getPerformanceAssessmentInstanceRecord() {
    return performanceAssessmentInstanceRecord;
  }

  public void setPerformanceAssessmentInstanceRecord(BQPerformanceAssessmentCreateOutputModelPerformanceAssessmentInstanceRecord performanceAssessmentInstanceRecord) {
    this.performanceAssessmentInstanceRecord = performanceAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return performanceAssessmentUpdateActionTaskRecord
  **/

  public Object getPerformanceAssessmentUpdateActionTaskRecord() {
    return performanceAssessmentUpdateActionTaskRecord;
  }

  public void setPerformanceAssessmentUpdateActionTaskRecord(Object performanceAssessmentUpdateActionTaskRecord) {
    this.performanceAssessmentUpdateActionTaskRecord = performanceAssessmentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return performanceAssessmentUpdateActionRequest
  **/

  public String getPerformanceAssessmentUpdateActionRequest() {
    return performanceAssessmentUpdateActionRequest;
  }

  public void setPerformanceAssessmentUpdateActionRequest(String performanceAssessmentUpdateActionRequest) {
    this.performanceAssessmentUpdateActionRequest = performanceAssessmentUpdateActionRequest;
  }


}

