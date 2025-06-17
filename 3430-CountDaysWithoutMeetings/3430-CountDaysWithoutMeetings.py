# Last updated: 6/17/2025, 10:24:30 PM
class Solution:
    def countDays(self, total_days: int, meetings: List[List[int]]) -> int:
        meetings.sort()
        free_days_count = 0
        last_meeting_end = 0

        for start_day, end_day in meetings:
            if last_meeting_end < start_day:
                free_days_count += start_day - last_meeting_end - 1
            last_meeting_end = max(last_meeting_end, end_day)

        free_days_count += total_days - last_meeting_end
        
        return free_days_count