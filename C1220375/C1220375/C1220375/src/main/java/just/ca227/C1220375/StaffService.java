package just.ca227.C1220375;

import just.ca227.C1220375.Staff;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class StaffService {

    private final Map<Long, Staff> staffRepo = new HashMap<>();

    public List<Staff> getAllStaffs() {
        return new ArrayList<>(staffRepo.values());
    }

    public Staff getStaffById(Long id) {
        return staffRepo.get(id);
    }

    public Staff createStaff(Staff staff) {
        staffRepo.put(staff.getId(), staff);
        return staff;
    }

    public Staff updateStaff(Long id, Staff updatedStaff) {
        staffRepo.put(id, updatedStaff);
        return updatedStaff;
    }

    public void deleteStaff(Long id) {
        staffRepo.remove(id);
    }
}
