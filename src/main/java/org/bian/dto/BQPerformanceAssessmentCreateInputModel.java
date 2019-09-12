package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceAssessmentCreateInputModelPerformanceAssessmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQPerformanceAssessmentCreateInputModel
 */
public class BQPerformanceAssessmentCreateInputModel   {
  private String customerCampaignPortfolioManagementPlanInstanceReference = null;

  private Object performanceAssessmentInitiateActionRecord = null;

  private BQPerformanceAssessmentCreateInputModelPerformanceAssessmentInstanceRecord performanceAssessmentInstanceRecord = null;


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
   * Get performanceAssessmentInstanceRecord
   * @return performanceAssessmentInstanceRecord
  **/

  public BQPerformanceAssessmentCreateInputModelPerformanceAssessmentInstanceRecord getPerformanceAssessmentInstanceRecord() {
    return performanceAssessmentInstanceRecord;
  }

  public void setPerformanceAssessmentInstanceRecord(BQPerformanceAssessmentCreateInputModelPerformanceAssessmentInstanceRecord performanceAssessmentInstanceRecord) {
    this.performanceAssessmentInstanceRecord = performanceAssessmentInstanceRecord;
  }


}

