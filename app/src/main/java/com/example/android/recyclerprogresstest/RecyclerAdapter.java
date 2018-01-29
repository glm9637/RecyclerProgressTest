package com.example.android.recyclerprogresstest;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Erzeugt von M. Fengels am 29.01.2018.
 */

public class RecyclerAdapter extends Adapter<RecyclerAdapter.RecyclerViewHolder> {
	
	private LayoutInflater inflater;
	
	public RecyclerAdapter(Context context){
		inflater = LayoutInflater.from(context);
	}
	
	@Override
	public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View rootView = inflater.inflate(R.layout.recycler_item,parent,false);
		return new RecyclerViewHolder(rootView);
	}
	
	@Override
	public void onBindViewHolder(RecyclerViewHolder holder, int position) {
	
	}
	
	@Override
	public int getItemCount() {
		return 30;
	}
	
	class RecyclerViewHolder extends RecyclerView.ViewHolder {
		
		public RecyclerViewHolder(View itemView) {
			super(itemView);
		}
	}
}
