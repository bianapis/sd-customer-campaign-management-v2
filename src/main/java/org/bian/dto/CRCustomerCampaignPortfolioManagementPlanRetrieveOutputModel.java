package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerCampaignPortfolioManagementPlanRetrieveOutputModelCustomerCampaignPortfolio;
import org.bian.dto.CRCustomerCampaignPortfolioManagementPlanRetrieveOutputModelCustomerCampaignPortfolioManagementPlanInstanceAnalysis;
import org.bian.dto.CRCustomerCampaignPortfolioManagementPlanRetrieveOutputModelCustomerCampaignPortfolioManagementPlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignPortfolioManagementPlanRetrieveOutputModel
 */
public class CRCustomerCampaignPortfolioManagementPlanRetrieveOutputModel   {
  private CRCustomerCampaignPortfolioManagementPlanRetrieveOutputModelCustomerCampaignPortfolio customerCampaignPortfolio = null;

  private String customerCampaignPortfolioManagementPlanRetrieveActionTaskReference = null;

  private Object customerCampaignPortfolioManagementPlanRetrieveActionTaskRecord = null;

  private String customerCampaignPortfolioManagementPlanRetrieveActionResponse = null;

  private CRCustomerCampaignPortfolioManagementPlanRetrieveOutputModelCustomerCampaignPortfolioManagementPlanInstanceReportRecord customerCampaignPortfolioManagementPlanInstanceReportRecord = null;

  private CRCustomerCampaignPortfolioManagementPlanRetrieveOutputModelCustomerCampaignPortfolioManagementPlanInstanceAnalysis customerCampaignPortfolioManagementPlanInstanceAnalysis = null;


  /**
   * Get customerCampaignPortfolio
   * @return customerCampaignPortfolio
  **/

  public CRCustomerCampaignPortfolioManagementPlanRetrieveOutputModelCustomerCampaignPortfolio getCustomerCampaignPortfolio() {
    return customerCampaignPortfolio;
  }

  public void setCustomerCampaignPortfolio(CRCustomerCampaignPortfolioManagementPlanRetrieveOutputModelCustomerCampaignPortfolio customerCampaignPortfolio) {
    this.customerCampaignPortfolio = customerCampaignPortfolio;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Campaign Portfolio Management Plan instance retrieve service call 
   * @return customerCampaignPortfolioManagementPlanRetrieveActionTaskReference
  **/

  public String getCustomerCampaignPortfolioManagementPlanRetrieveActionTaskReference() {
    return customerCampaignPortfolioManagementPlanRetrieveActionTaskReference;
  }

  public void setCustomerCampaignPortfolioManagementPlanRetrieveActionTaskReference(String customerCampaignPortfolioManagementPlanRetrieveActionTaskReference) {
    this.customerCampaignPortfolioManagementPlanRetrieveActionTaskReference = customerCampaignPortfolioManagementPlanRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerCampaignPortfolioManagementPlanRetrieveActionResponse
  **/

  public String getCustomerCampaignPortfolioManagementPlanRetrieveActionResponse() {
    return customerCampaignPortfolioManagementPlanRetrieveActionResponse;
  }

  public void setCustomerCampaignPortfolioManagementPlanRetrieveActionResponse(String customerCampaignPortfolioManagementPlanRetrieveActionResponse) {
    this.customerCampaignPortfolioManagementPlanRetrieveActionResponse = customerCampaignPortfolioManagementPlanRetrieveActionResponse;
  }


  /**
   * Get customerCampaignPortfolioManagementPlanInstanceReportRecord
   * @return customerCampaignPortfolioManagementPlanInstanceReportRecord
  **/

  public CRCustomerCampaignPortfolioManagementPlanRetrieveOutputModelCustomerCampaignPortfolioManagementPlanInstanceReportRecord getCustomerCampaignPortfolioManagementPlanInstanceReportRecord() {
    return customerCampaignPortfolioManagementPlanInstanceReportRecord;
  }

  public void setCustomerCampaignPortfolioManagementPlanInstanceReportRecord(CRCustomerCampaignPortfolioManagementPlanRetrieveOutputModelCustomerCampaignPortfolioManagementPlanInstanceReportRecord customerCampaignPortfolioManagementPlanInstanceReportRecord) {
    this.customerCampaignPortfolioManagementPlanInstanceReportRecord = customerCampaignPortfolioManagementPlanInstanceReportRecord;
  }


  /**
   * Get customerCampaignPortfolioManagementPlanInstanceAnalysis
   * @return customerCampaignPortfolioManagementPlanInstanceAnalysis
  **/

  public CRCustomerCampaignPortfolioManagementPlanRetrieveOutputModelCustomerCampaignPortfolioManagementPlanInstanceAnalysis getCustomerCampaignPortfolioManagementPlanInstanceAnalysis() {
    return customerCampaignPortfolioManagementPlanInstanceAnalysis;
  }

  public void setCustomerCampaignPortfolioManagementPlanInstanceAnalysis(CRCustomerCampaignPortfolioManagementPlanRetrieveOutputModelCustomerCampaignPortfolioManagementPlanInstanceAnalysis customerCampaignPortfolioManagementPlanInstanceAnalysis) {
    this.customerCampaignPortfolioManagementPlanInstanceAnalysis = customerCampaignPortfolioManagementPlanInstanceAnalysis;
  }


}

