package My.practice.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import My.practice.R
import My.practice.adapter.JobAdapter
import My.practice.adapter.JoblistAdapter
import My.practice.databinding.FragmentApplicationBinding
import My.practice.databinding.FragmentHomeBinding
import My.practice.model.JoblistModel
import androidx.recyclerview.widget.LinearLayoutManager

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ApplicationFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ApplicationFragment : Fragment() {
    private lateinit var binding: FragmentApplicationBinding
    private lateinit var adapter: JobAdapter
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentApplicationBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.joblist.layoutManager = LinearLayoutManager(requireActivity())

        val joblistList = ArrayList<JoblistModel>()
        joblistList.add(JoblistModel("Marketing",R.drawable.fb, "Facebook, Inc"))
        joblistList.add(JoblistModel("Data Analyst", R.drawable.fb, "Facebook, Inc"))
        joblistList.add(JoblistModel("Product Manager", R.drawable.fb, "Facebook, Inc"))
        joblistList.add(JoblistModel("Marketing", R.drawable.fb, "Facebook, Inc"))
        joblistList.add(JoblistModel("Data Analyst", R.drawable.fb, "Facebook, Inc"))
        joblistList.add(JoblistModel("Product Manager", R.drawable.fb, "Facebook, Inc"))
        joblistList.add(JoblistModel("Marketing", R.drawable.fb, "Facebook, Inc"))
        joblistList.add(JoblistModel("Data Analyst", R.drawable.fb, "Facebook, Inc"))
        joblistList.add(JoblistModel("Product Manager", R.drawable.fb, "Facebook, Inc"))


        adapter = JobAdapter(joblistList)

        binding.joblist.adapter = adapter
    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ApplicationFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ApplicationFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}