package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignPortfolioManagementPlanRetrieveInputModelCustomerCampaignPortfolioManagementPlanInstanceAnalysis;
import org.bian.dto.CRCustomerCampaignPortfolioManagementPlanRetrieveInputModelCustomerCampaignPortfolioManagementPlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignPortfolioManagementPlanRetrieveInputModel
 */
public class CRCustomerCampaignPortfolioManagementPlanRetrieveInputModel   {
  private Object customerCampaignPortfolioManagementPlanRetrieveActionTaskRecord = null;

  private String customerCampaignPortfolioManagementPlanRetrieveActionRequest = null;

  private CRCustomerCampaignPortfolioManagementPlanRetrieveInputModelCustomerCampaignPortfolioManagementPlanInstanceReportRecord customerCampaignPortfolioManagementPlanInstanceReportRecord = null;

  private CRCustomerCampaignPortfolioManagementPlanRetrieveInputModelCustomerCampaignPortfolioManagementPlanInstanceAnalysis customerCampaignPortfolioManagementPlanInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerCampaignPortfolioManagementPlanRetrieveActionTaskRecord
  **/

  public Object getCustomerCampaignPortfolioManagementPlanRetrieveActionTaskRecord() {
    return customerCampaignPortfolioManagementPlanRetrieveActionTaskRecord;
  }

  public void setCustomerCampaignPortfolioManagementPlanRetrieveActionTaskRecord(Object customerCampaignPortfolioManagementPlanRetrieveActionTaskRecord) {
    this.customerCampaignPortfolioManagementPlanRetrieveActionTaskRecord = customerCampaignPortfolioManagementPlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerCampaignPortfolioManagementPlanRetrieveActionRequest
  **/

  public String getCustomerCampaignPortfolioManagementPlanRetrieveActionRequest() {
    return customerCampaignPortfolioManagementPlanRetrieveActionRequest;
  }

  public void setCustomerCampaignPortfolioManagementPlanRetrieveActionRequest(String customerCampaignPortfolioManagementPlanRetrieveActionRequest) {
    this.customerCampaignPortfolioManagementPlanRetrieveActionRequest = customerCampaignPortfolioManagementPlanRetrieveActionRequest;
  }


  /**
   * Get customerCampaignPortfolioManagementPlanInstanceReportRecord
   * @return customerCampaignPortfolioManagementPlanInstanceReportRecord
  **/

  public CRCustomerCampaignPortfolioManagementPlanRetrieveInputModelCustomerCampaignPortfolioManagementPlanInstanceReportRecord getCustomerCampaignPortfolioManagementPlanInstanceReportRecord() {
    return customerCampaignPortfolioManagementPlanInstanceReportRecord;
  }

  public void setCustomerCampaignPortfolioManagementPlanInstanceReportRecord(CRCustomerCampaignPortfolioManagementPlanRetrieveInputModelCustomerCampaignPortfolioManagementPlanInstanceReportRecord customerCampaignPortfolioManagementPlanInstanceReportRecord) {
    this.customerCampaignPortfolioManagementPlanInstanceReportRecord = customerCampaignPortfolioManagementPlanInstanceReportRecord;
  }


  /**
   * Get customerCampaignPortfolioManagementPlanInstanceAnalysis
   * @return customerCampaignPortfolioManagementPlanInstanceAnalysis
  **/

  public CRCustomerCampaignPortfolioManagementPlanRetrieveInputModelCustomerCampaignPortfolioManagementPlanInstanceAnalysis getCustomerCampaignPortfolioManagementPlanInstanceAnalysis() {
    return customerCampaignPortfolioManagementPlanInstanceAnalysis;
  }

  public void setCustomerCampaignPortfolioManagementPlanInstanceAnalysis(CRCustomerCampaignPortfolioManagementPlanRetrieveInputModelCustomerCampaignPortfolioManagementPlanInstanceAnalysis customerCampaignPortfolioManagementPlanInstanceAnalysis) {
    this.customerCampaignPortfolioManagementPlanInstanceAnalysis = customerCampaignPortfolioManagementPlanInstanceAnalysis;
  }


}

