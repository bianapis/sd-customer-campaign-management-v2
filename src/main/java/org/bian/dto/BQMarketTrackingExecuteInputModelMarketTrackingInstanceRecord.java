package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMarketTrackingExecuteInputModelMarketTrackingInstanceRecordMarketTrackingWorkTask;

import javax.validation.Valid;
  
/**
 * BQMarketTrackingExecuteInputModelMarketTrackingInstanceRecord
 */
public class BQMarketTrackingExecuteInputModelMarketTrackingInstanceRecord   {
  private String marketTrackingWorkTaskType = null;

  private BQMarketTrackingExecuteInputModelMarketTrackingInstanceRecordMarketTrackingWorkTask marketTrackingWorkTask = null;

  private String marketTrackingWorkTaskWorkProducts = null;

  private String marketTrackingWorkTaskDateTime = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of work task (e.g. track competitor activity, track customer behaviors) 
   * @return marketTrackingWorkTaskType
  **/

  public String getMarketTrackingWorkTaskType() {
    return marketTrackingWorkTaskType;
  }

  public void setMarketTrackingWorkTaskType(String marketTrackingWorkTaskType) {
    this.marketTrackingWorkTaskType = marketTrackingWorkTaskType;
  }


  /**
   * Get marketTrackingWorkTask
   * @return marketTrackingWorkTask
  **/

  public BQMarketTrackingExecuteInputModelMarketTrackingInstanceRecordMarketTrackingWorkTask getMarketTrackingWorkTask() {
    return marketTrackingWorkTask;
  }

  public void setMarketTrackingWorkTask(BQMarketTrackingExecuteInputModelMarketTrackingInstanceRecordMarketTrackingWorkTask marketTrackingWorkTask) {
    this.marketTrackingWorkTask = marketTrackingWorkTask;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated notes, evaluations and findings for the market tracking work task 
   * @return marketTrackingWorkTaskWorkProducts
  **/

  public String getMarketTrackingWorkTaskWorkProducts() {
    return marketTrackingWorkTaskWorkProducts;
  }

  public void setMarketTrackingWorkTaskWorkProducts(String marketTrackingWorkTaskWorkProducts) {
    this.marketTrackingWorkTaskWorkProducts = marketTrackingWorkTaskWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date-time the market tracking task is performed 
   * @return marketTrackingWorkTaskDateTime
  **/

  public String getMarketTrackingWorkTaskDateTime() {
    return marketTrackingWorkTaskDateTime;
  }

  public void setMarketTrackingWorkTaskDateTime(String marketTrackingWorkTaskDateTime) {
    this.marketTrackingWorkTaskDateTime = marketTrackingWorkTaskDateTime;
  }


}

