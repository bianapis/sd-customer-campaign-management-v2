package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCampaignDirectionRetrieveInputModelCampaignDirectionInstanceAnalysis;
import org.bian.dto.BQCampaignDirectionRetrieveInputModelCampaignDirectionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCampaignDirectionRetrieveInputModel
 */
public class BQCampaignDirectionRetrieveInputModel   {
  private Object campaignDirectionRetrieveActionTaskRecord = null;

  private String campaignDirectionRetrieveActionRequest = null;

  private BQCampaignDirectionRetrieveInputModelCampaignDirectionInstanceReport campaignDirectionInstanceReport = null;

  private BQCampaignDirectionRetrieveInputModelCampaignDirectionInstanceAnalysis campaignDirectionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return campaignDirectionRetrieveActionTaskRecord
  **/

  public Object getCampaignDirectionRetrieveActionTaskRecord() {
    return campaignDirectionRetrieveActionTaskRecord;
  }

  public void setCampaignDirectionRetrieveActionTaskRecord(Object campaignDirectionRetrieveActionTaskRecord) {
    this.campaignDirectionRetrieveActionTaskRecord = campaignDirectionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return campaignDirectionRetrieveActionRequest
  **/

  public String getCampaignDirectionRetrieveActionRequest() {
    return campaignDirectionRetrieveActionRequest;
  }

  public void setCampaignDirectionRetrieveActionRequest(String campaignDirectionRetrieveActionRequest) {
    this.campaignDirectionRetrieveActionRequest = campaignDirectionRetrieveActionRequest;
  }


  /**
   * Get campaignDirectionInstanceReport
   * @return campaignDirectionInstanceReport
  **/

  public BQCampaignDirectionRetrieveInputModelCampaignDirectionInstanceReport getCampaignDirectionInstanceReport() {
    return campaignDirectionInstanceReport;
  }

  public void setCampaignDirectionInstanceReport(BQCampaignDirectionRetrieveInputModelCampaignDirectionInstanceReport campaignDirectionInstanceReport) {
    this.campaignDirectionInstanceReport = campaignDirectionInstanceReport;
  }


  /**
   * Get campaignDirectionInstanceAnalysis
   * @return campaignDirectionInstanceAnalysis
  **/

  public BQCampaignDirectionRetrieveInputModelCampaignDirectionInstanceAnalysis getCampaignDirectionInstanceAnalysis() {
    return campaignDirectionInstanceAnalysis;
  }

  public void setCampaignDirectionInstanceAnalysis(BQCampaignDirectionRetrieveInputModelCampaignDirectionInstanceAnalysis campaignDirectionInstanceAnalysis) {
    this.campaignDirectionInstanceAnalysis = campaignDirectionInstanceAnalysis;
  }


}

