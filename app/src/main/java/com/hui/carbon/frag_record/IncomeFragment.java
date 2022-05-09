package com.hui.carbon.frag_record;
import com.hui.carbon.R;
import com.hui.carbon.db.DBManager;
import com.hui.carbon.db.TypeBean;
import java.util.List;
/**
 * 收入记录页面
 */
public class IncomeFragment extends BaseRecordFragment {


    @Override
    public void loadDataToGV() {
        super.loadDataToGV();
        //获取数据库当中的数据源
        List<TypeBean> inlist = DBManager.getTypeList(1);
        typeList.addAll(inlist);
        adapter.notifyDataSetChanged();
        typeTv.setText("其他");
        typeIv.setImageResource(R.mipmap.in_qt_fs);
    }

    @Override
    public void saveAccountToDB() {
        accountBean.setKind(1);
        //

        String type = accountBean.getTypename();
        float carbonUnitData = DBManager.getCarbonUnitData(type);
        float money = accountBean.getMoney();
        float carbon_data = money * carbonUnitData;
        accountBean.setMoney(carbon_data);


        DBManager.insertItemToAccounttb(accountBean);
    }
}