/**
 * Created by joenggyu0@gmail.com on 4/21/20
 * Github : http://github.com/lenkim
 */

package net.slipp.franchise.domain.model.recruit;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class RecruitmentStarted {
    private final RecruitId recruitmentId;

}