package kr.co.hgney.listviewpractice.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import kr.co.hgney.listviewpractice.R
import kr.co.hgney.listviewpractice.datas.Student

class StudentAdapter(context: Context, resId: Int, list: List<Student>) : ArrayAdapter<Student>(context, resId, list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if(tempRow == null){
            tempRow = inf.inflate(R.layout.student_list_item, null)
        }
        val row = tempRow!!

        val nameAndAgeTxt = row.findViewById<TextView>(R.id.nameAndAgeTxt)
        val genderTxt = row.findViewById<TextView>(R.id.genderTxt)
        val data = mList.get(position)

        nameAndAgeTxt.text = data.name

        return row
    }
}