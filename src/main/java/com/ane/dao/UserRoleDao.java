package com.ane.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ane.domain.UserRole;

@Mapper
public interface UserRoleDao {

	/*public void saveUserRole(UserRole userRole);

	public Integer saveUserRoles(@Param("userRoles") List<UserRole> userRoles);

	public Integer updateUserRoleByUserId(@Param("userId") Long userId, @Param("organizationId") Long organizationId,
										  @Param("type") Integer type,@Param("orgStarId")Long orgStarId);
	public Integer updateUserRoleById(@Param("userId") Long userId, @Param("organizationId") Long organizationId,
										  @Param("id")Long id);

	public Integer countUnRoleUsers(@Param("schoolId") Long schoolId, @Param("query") String query,
			@Param("roleId") Long roleId, @Param("orgId") Long orgId, @Param("userType") String userType);

	public List<User> findUnRoleUsers(@Param("schoolId") Long schoolId, @Param("query") String query,
			@Param("roleId") Long roleId, @Param("orgId") Long orgId, @Param("userType") String userType,
			@Param("start") Integer start, @Param("limit") Integer limit);*/
	
	public List<UserRole> findRolePermissionByUserId(@Param("userId")Long userId);

	/*public List<Long> findOrgIdsByUserId(@Param("userId") Long userId);

	public Integer removeUserRoleById(@Param("id") Long id);

	public Integer removeUserRoleByUserIdAndRoleId(@Param("userId") Long userId, @Param("roleId")Long roleId);

	public UserRole getUserByUserIdAndOrgId(@Param("userId") Long userId, @Param("type") int type, @Param("orgId") Long orgId);
	
	public Integer countUserRoleByUserIdAndSchoolId(@Param("userId") Long userId, @Param("refId") Long refId, @Param("schoolId") Long schoolId);

	public Integer removeUserOragByUserId(@Param("userId") Long userId);	
	
	public List<UserRole> findUserIdsByOrg(@Param("orgId")Long orgId);
	
	public Integer delUserRoleByOrgByUserId(@Param("userId")Long userId, @Param("refId")Long refId,@Param("isDeleted") Integer isDeleted);
	
	public Integer delOrgUserRoleByUserId(@Param("userId")Long userId, @Param("refId")Long refId);

	public Integer delUserRoleByOrgId(@Param("orgId")Long orgId);*/
	
}
 