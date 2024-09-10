package com.breezefieldsalesmmhg.features.mylearning.apiCall

import com.breezefieldsalesmmhg.base.BaseResponse
import com.breezefieldsalesmmhg.features.leaderboard.api.LeaderboardOverAllData
import com.breezefieldsalesmmhg.features.leaderboard.api.LeaderboardOwnData
import com.breezefieldsalesmmhg.features.login.api.opportunity.OpportunityListApi
import com.breezefieldsalesmmhg.features.login.model.opportunitymodel.OpportunityStatusListResponseModel
import com.breezefieldsalesmmhg.features.mylearning.BookmarkFetchResponse
import com.breezefieldsalesmmhg.features.mylearning.BookmarkResponse
import com.breezefieldsalesmmhg.features.mylearning.CONTENT_WISE_QA_SAVE
import com.breezefieldsalesmmhg.features.mylearning.ContentCountSave_Data
import com.breezefieldsalesmmhg.features.mylearning.LMSLeaderboardOverAllData
import com.breezefieldsalesmmhg.features.mylearning.LMSLeaderboardOwnData
import com.breezefieldsalesmmhg.features.mylearning.LMS_CONTENT_INFO
import com.breezefieldsalesmmhg.features.mylearning.MyCommentListResponse
import com.breezefieldsalesmmhg.features.mylearning.MyLarningListResponse
import com.breezefieldsalesmmhg.features.mylearning.SectionsPointsList
import com.breezefieldsalesmmhg.features.mylearning.TopicListResponse
import com.breezefieldsalesmmhg.features.mylearning.VideoPlayLMS
import com.breezefieldsalesmmhg.features.mylearning.VideoTopicWiseResponse
import io.reactivex.Observable

class LMSRepo(val apiService: LMSApi) {

    fun getTopics(user_id: String): Observable<TopicListResponse> {
        return apiService.getTopics(user_id)
    }

    fun getTopicsWiseVideo(user_id: String ,topic_id: String): Observable<VideoTopicWiseResponse> {
        return apiService.getTopicswiseVideoApi(user_id,topic_id)
    }

    fun saveContentInfoApi(lms_content_info: LMS_CONTENT_INFO): Observable<BaseResponse> {
        return apiService.saveContentInfoApi(lms_content_info)
    }

    fun getMyLraningInfo(user_id: String): Observable<MyLarningListResponse> {
        return apiService.getMyLearningContentList(user_id)
    }

    fun getCommentInfo(topic_id: String ,content_id: String): Observable<MyCommentListResponse> {
        return apiService.getCommentInfo(topic_id , content_id)
    }

    fun saveContentWiseQAApi(mCONTENT_WISE_QA_SAVE: CONTENT_WISE_QA_SAVE): Observable<BaseResponse> {
        return apiService.saveContentWiseQAApi(mCONTENT_WISE_QA_SAVE)
    }

    fun saveContentCount(mContentCountSave_Data: ContentCountSave_Data): Observable<BaseResponse> {
        return apiService.saveContentCount(mContentCountSave_Data)
    }

    fun ownDatalist(user_id: String,branchwise: String,flag: String): Observable<LMSLeaderboardOwnData> {
        return apiService.ownDatalist(user_id,branchwise,flag)
    }

    fun overAllAPI(user_id: String,branchwise: String,flag: String): Observable<LMSLeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,branchwise,flag)
    }

    fun overAllDatalist(session_token: String): Observable<SectionsPointsList> {
        return apiService.overAllDatalist(session_token)
    }

    fun bookmarkApiCall(obj:BookmarkResponse): Observable<BaseResponse> {
        return apiService.bookmarkApiCallApi(obj)
    }

    fun getBookmarkedApiCall(user_id:String): Observable<BookmarkFetchResponse> {
        return apiService.getBookmarkedApiCallApi(user_id)
    }
}