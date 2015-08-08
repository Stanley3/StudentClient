package com.chejiawang.android.studentclient.order;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.chejiawang.android.studentclient.app.Logger;
import com.chejiawang.android.studentclient.bean.Entity;
import com.chejiawang.android.studentclient.bean.MyOrderRecord;
import com.chejiawang.android.studentclient.utils.ListEntity;
import com.chejiawang.android.studentclient.utils.StringUtils;

public class PracticeLogList extends Entity implements ListEntity {
	public static String TAG = "PracticeLogList";
	private List<MyOrderRecord> practiceLogList = new ArrayList<MyOrderRecord>();

	public List<MyOrderRecord> getHaveOrderList() {
		return practiceLogList;
	}

	public void setHaveOrderList(List<MyOrderRecord> haveOrderList) {
		this.practiceLogList = haveOrderList;
	}

	public static PracticeLogList parse(InputStream inputStream) throws Exception {
		String result = StringUtils.inStream2String(inputStream);

		Logger.e(TAG, "Response:" + result);
		if (result == null) {
			return null;
		}
		PracticeLogList list = new PracticeLogList();
		try {
			JSONArray jsonArry = new JSONArray(result);
			for (int i = 0; i < jsonArry.length(); i++) {
				JSONObject recordJson = jsonArry.getJSONObject(i);
				MyOrderRecord record = new MyOrderRecord();
//				record.setStudent_name(recordJson.getString("student_name"));
//				record.setOrder_time(recordJson.getString("order_time"));
//				record.setCourse_status(recordJson.getString("course_status"));
//				record.setTraining_start_time(recordJson.getString("training_start_time"));
//				record.setTraining_end_time(recordJson.getString("training_end_time"));
//				record.setStatus(recordJson.getString("status"));
				list.getHaveOrderList().add(record);
			}

		} catch (JSONException e) {
			e.printStackTrace();
			return null;
		}

		return list;

	}

	@Override
	public List<?> getList() {

		return practiceLogList;
	}

	@Override
	public Map<?, ?> getMap() {
		// TODO Auto-generated method stub
		return null;
	}
}
