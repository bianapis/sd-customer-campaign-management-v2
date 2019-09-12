package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMarketTrackingRetrieveOutputModelMarketTrackingInstanceRecordMarketTrackingWorkTask
 */
public class BQMarketTrackingRetrieveOutputModelMarketTrackingInstanceRecordMarketTrackingWorkTask   {
  private String generalMarketResearchDirectoryEntryInstanceReference = null;

  private Object generalMarketResearchDirectoryEntryInstanceRecord = null;

  private String competitorAnalysisInstanceReference = null;

  private Object competitorAnalysisInstanceRecord = null;

  private String customerSurveyProcedureInstanceReference = null;

  private Object customerSurveyProcedureInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an internally maintained market research viewpoint 
   * @return generalMarketResearchDirectoryEntryInstanceReference
  **/

  public String getGeneralMarketResearchDirectoryEntryInstanceReference() {
    return generalMarketResearchDirectoryEntryInstanceReference;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceReference(String generalMarketResearchDirectoryEntryInstanceReference) {
    this.generalMarketResearchDirectoryEntryInstanceReference = generalMarketResearchDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The market research viewpoint definition and content 
   * @return generalMarketResearchDirectoryEntryInstanceRecord
  **/

  public Object getGeneralMarketResearchDirectoryEntryInstanceRecord() {
    return generalMarketResearchDirectoryEntryInstanceRecord;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceRecord(Object generalMarketResearchDirectoryEntryInstanceRecord) {
    this.generalMarketResearchDirectoryEntryInstanceRecord = generalMarketResearchDirectoryEntryInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an internally maintained competitor analysis viewpoint 
   * @return competitorAnalysisInstanceReference
  **/

  public String getCompetitorAnalysisInstanceReference() {
    return competitorAnalysisInstanceReference;
  }

  public void setCompetitorAnalysisInstanceReference(String competitorAnalysisInstanceReference) {
    this.competitorAnalysisInstanceReference = competitorAnalysisInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The competitor analysis viewpoint definition and content 
   * @return competitorAnalysisInstanceRecord
  **/

  public Object getCompetitorAnalysisInstanceRecord() {
    return competitorAnalysisInstanceRecord;
  }

  public void setCompetitorAnalysisInstanceRecord(Object competitorAnalysisInstanceRecord) {
    this.competitorAnalysisInstanceRecord = competitorAnalysisInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to internally maintained customer survey materials 
   * @return customerSurveyProcedureInstanceReference
  **/

  public String getCustomerSurveyProcedureInstanceReference() {
    return customerSurveyProcedureInstanceReference;
  }

  public void setCustomerSurveyProcedureInstanceReference(String customerSurveyProcedureInstanceReference) {
    this.customerSurveyProcedureInstanceReference = customerSurveyProcedureInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The customer survey materials description and content 
   * @return customerSurveyProcedureInstanceRecord
  **/

  public Object getCustomerSurveyProcedureInstanceRecord() {
    return customerSurveyProcedureInstanceRecord;
  }

  public void setCustomerSurveyProcedureInstanceRecord(Object customerSurveyProcedureInstanceRecord) {
    this.customerSurveyProcedureInstanceRecord = customerSurveyProcedureInstanceRecord;
  }


}

