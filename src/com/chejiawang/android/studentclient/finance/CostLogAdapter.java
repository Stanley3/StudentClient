package com.chejiawang.android.studentclient.finance;


import com.chejiawang.android.studentclient.R;
import com.chejiawang.android.studentclient.base.RecycleBaseAdapter;
import com.chejiawang.android.studentclient.bean.DisplayStudentDepositReocrd;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CostLogAdapter extends RecycleBaseAdapter {

	public CostLogAdapter() {
		super();
	}
	public CostLogAdapter(View headerView){
		mHeaderView = headerView;
	}
	
	@Override
	protected View OnCreateItemView(ViewGroup parent, int viewType) {
		return getLayoutInflater(parent.getContext()).inflate(R.layout.finace_cost_list_item, null);
	}

	@Override
	protected ViewHolder onCreateItemViewHolder(View view, int viewType) {
		return new ViewHolder(viewType, view);
	}
	
	@Override
	protected void onBindItemViewHolder(RecycleBaseAdapter.ViewHolder vh, int position) {
		super.onBindItemViewHolder(vh, position);
		CostLogAdapter.ViewHolder holder= (ViewHolder) vh;
		DisplayStudentDepositReocrd record = (DisplayStudentDepositReocrd)_data.get(position);
		
//		holder.tv_name.setText(record.getStudent_name());
//		String course = record.getCourse_status();
//		course = course.equals("2")? "预约科目二" : "预约科目三";
//		holder.tv_order_subject.setText(course);
//		String[] start_time = record.getTraining_start_time().split(" ");
//		String[] end_time = record.getTraining_end_time().split(" ");
//		holder.tv_order_day.setText("日期:" + start_time[0]);
//		holder.tv_practice_time.setText(start_time[1] + "-" + end_time[1]);
		
		//需要添加是否是VIP包过信息    2015.6.27  孙晓雨
		
		
	}
	public static class ViewHolder extends RecycleBaseAdapter.ViewHolder{
		
		public TextView tv_date;
		public TextView tv_school;
		public TextView tv_coach_name;
		public TextView tv_subject_num;

		public ViewHolder(int viewType, View view) {
			super(viewType, view);
			tv_date = (TextView) view.findViewById(R.id.tv_date);
			tv_school = (TextView) view.findViewById(R.id.tv_school);
			tv_coach_name = (TextView) view.findViewById(R.id.tv_coach_name);
			tv_subject_num = (TextView) view.findViewById(R.id.tv_subject_num);
		}
	}

}
