 
package com.guesswho.app.adapter;

import java.util.ArrayList;

import com.guesswho.app.R;
import com.guesswho.app.entity.Top;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class TopAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Top> mylist;
    private ArrayList<Top> globallist;
    public TopAdapter(Context context,ArrayList<Top> mylist, ArrayList<Top> globallist){
    	this.context = context;
        this.mylist = mylist;
        this.globallist = globallist;
    }
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if(convertView==null){
			holder = new ViewHolder();
			convertView = View.inflate(context, R.layout.top_item, null);
			holder.no0 = (TextView) convertView.findViewById(R.id.top_no0_tv);
			holder.name0 = (TextView) convertView.findViewById(R.id.top_name0_tv);
			holder.points0 = (TextView) convertView.findViewById(R.id.top_points0_tv);
			holder.time0 = (TextView) convertView.findViewById(R.id.top_time0_tv);
			holder.no1 = (TextView) convertView.findViewById(R.id.top_no1_tv);
			holder.name1 = (TextView) convertView.findViewById(R.id.top_name1_tv);
			holder.points1 = (TextView) convertView.findViewById(R.id.top_points1_tv);
			holder.time1 = (TextView) convertView.findViewById(R.id.top_time1_tv);
			
			convertView.setTag(holder);
		}else{
			holder = (ViewHolder) convertView.getTag();
		}
		if(position==0){
			holder.no0.setText("");
			holder.name0.setText("Name");
			holder.points0.setText("Points");
			holder.time0.setText("Time");
			
			holder.no1.setText("");
			holder.name1.setText("Name");
			holder.points1.setText("Points");
			holder.time1.setText("Time");
			
			
		}else{
			Top mytop = mylist.get(position);
			if(position==1||position==2||position==3){
				holder.no0.setTextColor(Color.RED);
				holder.no1.setTextColor(Color.RED);
			}
			holder.no0.setText(String.valueOf(position));
			holder.name0.setText(mytop.name);
			holder.points0.setText(mytop.points);
			holder.time0.setText(mytop.time);
			
			Top gloabl = globallist.get(position);
			holder.no1.setText(String.valueOf(position));
			holder.name1.setText(gloabl.name);
			holder.points1.setText(gloabl.points);
			holder.time1.setText(gloabl.time);
		}
		
		return convertView;
	}
	private static class ViewHolder{
		TextView no0,name0,points0,time0,no1,name1,points1,time1;
	}

}
