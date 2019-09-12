package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerCampaignPortfolioManagementPlanCreateOutputModelCustomerCampaignPortfolioCustomerCampaignPerformanceRecordCustomerCampaignProcedureInstanceReference
 */
public class CRCustomerCampaignPortfolioManagementPlanCreateOutputModelCustomerCampaignPortfolioCustomerCampaignPerformanceRecordCustomerCampaignProcedureInstanceReference   {
  private String employeeBusinessUnitReference = null;

  private String customerCampaignProcedureSetup = null;

  private String customerCampaignProcedureVersionNumber = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the business unit responsible for the campaign execution 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the deployment set-up/configuration of the campaign for reference 
   * @return customerCampaignProcedureSetup
  **/

  public String getCustomerCampaignProcedureSetup() {
    return customerCampaignProcedureSetup;
  }

  public void setCustomerCampaignProcedureSetup(String customerCampaignProcedureSetup) {
    this.customerCampaignProcedureSetup = customerCampaignProcedureSetup;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The customer campaign version number used in the event 
   * @return customerCampaignProcedureVersionNumber
  **/

  public String getCustomerCampaignProcedureVersionNumber() {
    return customerCampaignProcedureVersionNumber;
  }

  public void setCustomerCampaignProcedureVersionNumber(String customerCampaignProcedureVersionNumber) {
    this.customerCampaignProcedureVersionNumber = customerCampaignProcedureVersionNumber;
  }


}

